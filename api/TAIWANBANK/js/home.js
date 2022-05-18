const calculationType = [
  {
    code: 'AP1',
    label: '保額 - 已給付老年住院醫療提前給付保險金 + 未到期保費 + 生存保險金',
  },
  {
    code: 'IA1',
    label: '展期保額',
  },
  {
    code: 'IC1',
    label: '展期保額 - 已給付老年住院醫療提前給付保險金',
  },
  {
    code: 'AA1CA1',
    label: '保額* 保額倍數 與 身故日之保單價值準備金 取其大',
  },
];
if (!window.Promise) {
  window.Promise = Promise;
}

function analyze() {
  const id = document.getElementById('u5_input').value;
  const dieDate = document.getElementById('u8_input').value;
  // 事故原因
  const accidentReason = document.querySelector(
    "input[type='radio'][name=accidentReasonGroup]:checked"
  )?.value;
  // 申請項目
  const applyItem = document.querySelector(
    "input[type='radio'][name=applyItemGroup]:checked"
  )?.value;

  // 如果有欄位為空
  if (!id || !dieDate || !accidentReason || !applyItem) {
    alert('資料輸入區所有欄位都必填!');
  } else {
    // if (!id || !dieDate || !accidentReason || )
    fetch('http://localhost:8080/odm/getCalculation', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json;charset=UTF-8',
        Accept: 'application/json',
      },
      body: JSON.stringify({
        id,
        dieDate,
        accidentReason,
        applyItem,
      }),
    })
      .then(function (response) {
        if (!response.ok) {
          throw new Error(response.statusText);
        }
        return response.json();
      })
      .then(function (data) {
        const ruleCode = data.ruleCode;
        // 規則編碼
        document.getElementById('u13_input').value = ruleCode;
        const calculationCode = data.calculationCode;
        //  找到公式編碼代表的中文
        const codeLabel =
          ruleCode === '沒有相符的規則'
            ? ''
            : calculationType.find((type) => type.code === calculationCode)
                .label;
        // 經過公式算出來的金額
        const paymentAmount = data.paymentAmount;
        // 實際給付金額(算出的金額再去做加減)
        const actualPaymentAmount = data.actualPaymentAmount;
        const otherPayment = actualPaymentAmount - paymentAmount;
        // 計算類別
        document.getElementById('u26_input').value = data.calculationType;
        // 公式編碼
        document.getElementById('u16_input').value = calculationCode;
        // 公式編碼中文
        document.getElementById('u17_input').value = codeLabel;
        // 算出的值
        document.getElementById('u18_input').value = paymentAmount;
        // 實際給付金額
        document.getElementById('u32_input').value = actualPaymentAmount;
        // 生活扶助金/理賠金額
        document.getElementById('u34_input').value = paymentAmount;
        // 其他金額
        document.getElementById('u36_input').value = otherPayment;

        const productNo = ruleCode.substring(0, 2);
        document.getElementById('paymentNotFoundLabel').style.display = 'none';
        if (productNo === 'AM') {
          document.getElementById('10CalculationLabel').style.display = 'none';
          document.getElementById('amCalculationLabel').style.display = 'block';
        } else if (productNo === '10') {
          document.getElementById('amCalculationLabel').style.display = 'none';
          document.getElementById('10CalculationLabel').style.display = 'block';
        }
        // }
      })
      .catch(function (err) {
        console.log('err: ' + err);
      });
  }
}
