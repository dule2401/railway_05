$(function () {
    $(".header").load("header.html");
    $(".footer").load("footer.html");
    $(".column1").load("column1.html");
});
var employees  = [];

function Employee(name, department, phone) {
    this.name = name;
    this.department = department;
    this.phone = phone;
}

function clickHome() {
    $(".column1").load("home.html");
}
function clickViewListAccount() {
    $(".column1").load("viewlistAccount.html");
    initEmployees();
}
function clicklogin() {
    $(".column1").load("login.html");
}
function initEmployees() {
    var url = "https://5fa3f6a0f10026001618e3a8.mockapi.io/employee";
    $.get(url, function (data, status) {
        console.log(data);
        employees = data;
        fillDataToTable();
    });

}
function fillDataToTable() {
    $('tbody').empty();
    employees.forEach(function(employee) {
        $('tbody').append(
            '<tr>' +
            '<td>' + employee.name + '</td>' +
            '<td>' + employee.department + '</td>' +
            '<td>' + employee.phone + '</td>' +
            '</tr>')
    });

}
function addNewEmployee() {
    openPopup();
    resetFormAdd();
}

function resetFormAdd() {
    document.getElementById("name").value = "";
    document.getElementById("department").value = "";
    document.getElementById("phone").value = "";
}

function saveNewEmployee() {
    var name = $("#name").val();
    var department = $("#department").val();
    var phone = $("#phone").val();

    var url = "https://5fa3f6a0f10026001618e3a8.mockapi.io/employee";
    var newEmployee = new Employee(name, department, phone);

    $.post(url, newEmployee, function(data, status) {
        initEmployees();
        closePopup();
    })
}

function openPopup() {
    $("#myModal").modal('show');
}

function closePopup() {
    $('#myModal').modal('hide');
}
function validate(){
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;
    if ( username == "username1" && password == "password1"){
    alert ("Login successfully");
         }
         else{
           alert("Invalid username or password");
           }
         return false;
         }