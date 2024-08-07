javascript
const readline = require("readline");

function grade(examscore, assessmentscore) {
  let total_score = examscore + assessmentscore;
  if (examscore >= 25 && assessmentscore >= 15 && total_score >= 40) {
    return true;
  } else {
    return false;
  }
}

function fees(feespercentage) {
  if (feespercentage >= 100) {
    return true;
  } else {
    return false;
  }
}

let rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let examscore = null;
let assessmentscore = null;
let feespaid = null;

rl.question("Enter your Exams score:", (answer) => {
  examscore = parseInt(answer);
  rl.question("Enter your Assessment score:", (answer) => {
    assessmentscore = parseInt(answer);
    rl.question(
      "Enter the amount of fees paid in percentage(exclude the '%' sign):",
      (answer) => {
        feespaid = parseInt(answer);
        rl.close();
        if (grade(examscore, assessmentscore) && fees(feespaid)) {
          console.log("Congratulations! You qualify to earn a certificate");
        } else {
          if (grade(examscore, assessmentscore)) {
            console.log(
              "Congratulations! You passed the course \nBut you can't be offered a certificate since you haven't payed your fees in full"
            );
          } else {
            if (examscore <= 25 && assessmentscore >= 15) {
              console.log("Sorry you failed the exams but passed the assessment");
            } else if (examscore >= 25 && assessmentscore < 15) {
              console.log("Sorry you failed the assessment but passed the exams");
            } else {
              console.log("Sorry you failed both the assessment and the exams");
            }
          }
        }
      }
    );
  });
});
