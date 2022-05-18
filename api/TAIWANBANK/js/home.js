if (!window.Promise) {
    window.Promise = Promise;
  }

  function analyze() {

    const id = document.getElementById("u5_input").value;
    const dieDate = document.getElementById("u8_input").value;
    // 事故原因
    const accidentReason = document.querySelector("input[type='radio'][name=accidentReasonGroup]:checked").value;
    // 申請項目
    const applyItem = document.querySelector("input[type='radio'][name=applyItemGroup]:checked").value;


    fetch('http://localhost:8080/odm/getCalculation',
      {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json;charset=UTF-8',
          'Accept': 'application/json'
        },
        body: JSON.stringify({
          id,
          dieDate,
          accidentReason,
          applyItem,
        })
      })
      .then(function (response) {
        if (!response.ok) {
          throw new Error(response.statusText);
        }
        return response.json();
      }).then(function (data) {
        document.getElementById('u13_input').value = data.ruleCode;
        document.getElementById('u26_input').value = data.calculationType;
        document.getElementById('u16_input').value = data.calculationCode;
        document.getElementById('u32_input').value = data.paymentAmount;

      }).catch(function (err) {
        console.log("err: " + err);
      });


  }