
/*Name: Afnan Islam
    Date: 18-02-2023
    Section: CST 8285 section 303
    Lab: Lab5
    File: form.js
    Lab objective:To learn manupulating form behaviour to validate form. */

let emailInput=document.querySelector("#email");
let termInput=document.querySelector("#terms");
let userInput=document.querySelector("#user");
let lowInput=document.querySelector("#user");
let newsInput=document.querySelector("#newsletters"); 
let passInput=document.querySelector("#pass");
let pass2Input=document.querySelector("#pass2");


// create paragraph to display the error Msg returented by vaildateEmail() function 
// and assign this paragraph to the class warning to style the error MSg
let emailError=document.createElement('p');
emailError.setAttribute("class","warning");

//append the created element to the parent of email div
document.querySelectorAll(".form-group")[0].append(emailError);

// create paragraph to display the error Msg returented by vaildateTerms() function 
// and assign this paragraph to the class warning to style the error MSg
let termError=document.createElement('p');
termError.setAttribute("class","warning");


//append the created element to the parent of check div
document.querySelectorAll(".form-check")[0].append(termError);




//userIinputError
let userError=document.createElement('p');
userError.setAttribute("class","warning");

document.querySelectorAll(".form-user")[0].append(userError);


//passInputError
let passError=document.createElement('p');
passError.setAttribute("class","warning");

document.querySelectorAll(".form-pass")[0].append(passError);

//To match passwords
let pass2Error=document.createElement('p');
pass2Error.setAttribute("class","warning");

document.querySelectorAll(".form-pass2")[0].append(pass2Error);

//To report spam
let newsError=document.createElement('p');
newsError.setAttribute("class","warning");

document.querySelectorAll(".newsletters")[0].append(newsError);


//define a global variables
let termsErrorMsg="terms must be checked";
let defaultMSg="";
let emailErrorMsg="Please enter a valid email formate(xyx@xyz.xyz)";
let userErrorMsg="User name must be less than 20 charchacter and non-empty";
let passErrorMsg="password should be at least 6 characters long and non-empty";
let newsErrorMsg="It can be possibly spam";
let matchErrorMsg="passwords don't match";
let passMsg="use at least one uppercase and one lowercase character";


//method to validate email
function vaildateEmail(){
    let email = emailInput.value; // access the value of the email
    let regexp=/\S+@\S+\.\S+/; //reg. expression 
    
    if(regexp.test(email)){ //test is predefiend method to check if the entered email matches the regexp
    error = defaultMSg;}
    
    if(document.querySelector('#email').value.length == 0)
    return "Email must be non-empty"
    else {
    error = emailErrorMsg;}
    return error;
      
}
//method to validate the terms 
function validatTerms(){
    if(termInput.checked)
    return defaultMSg;
    else
    return termsErrorMsg;

}

//method to validate the user name length 
function validateUser(){

  if(document.querySelector('#user').value.length >= 20)
  return userErrorMsg;
  if(document.querySelector('#user').value.length == 0)
  return userErrorMsg;
  else
  return defaultMSg;

}



//method to validate the user getting spam warning
function validateNews(){
  if(document.querySelector('#newsletters').checked)
  return newsErrorMsg;
  else
  return defaultMSg;

}

//method to validate the password to be one uper and one lower case at least, also at least 6 charachter long
function validatePass(){
  let pasw = /^[A-Za-z]\w{7,14}$/;
  if (document.querySelector('#pass').value.length <=6)
  return passErrorMsg;
  if (pasw.test(document.querySelector('#pass').value))
  return defaultMSg;
  else
  return passMsg;
}


//method to validate the passwords match
function validatePass2(){

  if (document.querySelector('#pass2').value != document.querySelector('#pass').value)
  return matchErrorMsg;
  else
  return defaultMSg;
}
 


//event handler for submit event
function validate(e){
    e.preventDefault(); 
    let valid = true;//global validation 
    let emailValidation=vaildateEmail();
    let termsValidation=validatTerms();
    let userValidation=validateUser();
    let newsValidation=validateNews();
    let passValidation=validatePass();
    let pass2Validation=validatePass2();

    if(emailValidation !==defaultMSg){
        emailError.textContent = emailValidation;
        valid = false;
    }
    if(termsValidation!==defaultMSg){
        termError.textContent=termsValidation;
        valid = false;
    }

    
    if(userValidation !==defaultMSg){
      userError.textContent=userValidation;
        valid = false;
    }

   if (pass2Validation !==defaultMSg){
      pass2Error.textContent=pass2Validation;
      valid = false;
   }

   if (passValidation !==defaultMSg){
    passError.textContent=passValidation;
    valid = false;
 }
    

    if(newsValidation !==defaultMSg){
      newsError.textContent=newsValidation;
        valid = false;
    }

    return valid;
};

// event listner to empty the text inside the two paragraph when resent
function resetFormError() {
    emailError.textContent=defaultMSg;
    termError.textContent=defaultMSg;
    userError.textContent=defaultMSg;
    newsError.textContent=defaultMSg;
    passError.textContent=defaultMSg;
    pass2Error.textContent=defaultMSg;
}


// add event listner to the email if you entered correct email,the error paragraph with be empty
emailInput.addEventListener("blur",()=>{ // arrow function
    let x=vaildateEmail();
    if(x == defaultMSg){
        emailError.textContent = defaultMSg;
    }
    });

// add event listner to the checkbox if you check the terms box,the error paragraph with be empty
termInput.addEventListener("change", function(){// anonymous function
    if(this.checked){
        termError.textContent= defaultMSg;
    }
    });

    
// add event listner to the username if you entered correct username,the error paragraph with be empty
userInput.addEventListener("change", function(){         // anonymous function
      let x =validateUser();
      if(x == defaultMSg){
        userError.textContent=defaultMSg;
      }
      });

// add event listner to the password if you entered correct password,the error paragraph with be empty
passInput.addEventListener("cahange", function(){
        let x =validatePass();
      if(x == defaultMSg){
        passError.textContent=defaultMSg;
      }
    });

// add event listner to the retype-password if you entered correct retype-password,the error paragraph with be empty
pass2Input.addEventListener("cahange", function(){
      let x =validatePass();
    if(x == defaultMSg){
      pass2Error.textContent=defaultMSg;
    }
  });

  // add event listner to the checkbox if you check the terms box,the error paragraph with be empty
newsInput.addEventListener("change", function(){         // anonymous function
        let x =validateNews();
        if(x == defaultMSg){
          newsError.textContent=defaultMSg;
        }
        });

document.registrationForm.addEventListener("submit", validate);
document.registrationForm.addEventListener("reset", resetFormError);