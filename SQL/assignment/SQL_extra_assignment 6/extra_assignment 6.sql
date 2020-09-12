DROP DATABASE IF EXISTS project_all;
CREATE DATABASE project_all;
USE project_all;
CREATE TABLE project_modules (
    ModuleID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ProjectID TINYINT UNSIGNED NOT NULL,
    EmployeeID TINYINT UNSIGNED NOT NULL,
    ProjectModulesDate DATETIME DEFAULT NOW(),
    ProjectModulesOn DATETIME DEFAULT NOW(),
    ProjectModulesDescription NVARCHAR(50)
);
CREATE TABLE Projects (
    ProjectID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ManagerID TINYINT UNSIGNED NOT NULL,
    ProjectName NVARCHAR(50) NOT NULL,
    ProjectStartDate DATETIME DEFAULT NOW(),
    ProjectDescription NVARCHAR(50) NOT NULL,
    ProjectDetail NVARCHAR(50) NOT NULL,
    ProjectCompletedOn DATETIME DEFAULT NOW(),
    FOREIGN KEY (ProjectID)REFERENCES project_modules (ProjectID)
    
);
CREATE TABLE ` Work` (
    WorkDoneID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    EmployeeID TINYINT UNSIGNED NOT NULL,
    ModuleID TINYINT UNSIGNED NOT NULL,
    WorkDoneDate DATETIME DEFAULT NOW(),
    WorkDoneDescription NVARCHAR(50) NOT NULL,
    WorkDoneStatus BIT NOT NULL,
    FOREIGN KEY (ModuleID) REFERENCES project_modules(ModuleID)
);
CREATE TABLE Employee (
    EmployeeID TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    EmployeeLastName NVARCHAR(30) NOT NULL,
    EmployeeFirstName NVARCHAR(30) NOT NULL,
    EmployeeHireDate DATETIME DEFAULT NOW(),
    EmployeeStatus BIT NOT NULL,
    SupervisorID TINYINT UNSIGNED NOT NULL,
    SocialSecurityNumbe CHAR(5),
    FOREIGN KEY (EmployeeID) REFERENCES	 ` Work`(EmployeeID)

);

insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (1, 1, 1, '11/5/2019', '7/1/2020', 'ÅÍÎÏ˝ÓÔÒÚÆ☃');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (2, 2, 2, '10/21/2019', '3/16/2020', '　');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (3, 3, 3, '5/3/2020', '8/8/2020', '''"''');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (4, 4, 4, '12/12/2019', '6/29/2020', '1');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (5, 5, 5, '7/13/2020', '3/29/2020', '🐵 🙈 🙉 🙊');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (6, 6, 6, '12/15/2019', '10/10/2019', '../../../../../../../../../../../etc/passwd%00');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (7, 7, 7, '8/4/2020', '5/22/2020', '0️⃣ 1️⃣ 2️⃣ 3️⃣ 4️⃣ 5️⃣ 6️⃣ 7️⃣ 8️⃣ 9️⃣ 🔟');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (8, 8, 8, '1/7/2020', '6/2/2020', 'Ṱ̺̺̕o͞ ̷i̲̬͇̪͙n̝̗͕v̟̜̘̦͟o̶̙̰̠kè͚̮̺̪̹̱̤ ̖t̝͕̳̣̻̪͞h̼͓̲̦̳̘̲e͇̣̰̦̬͎ ̢̼̻̱̘h͚͎͙̜̣̲ͅi̦̲̣̰̤v̻͍e̺̭̳̪̰-m̢iͅn̖̺̞̲̯̰d̵̼̟͙̩̼̘̳ ̞̥̱̳̭r̛̗̘e͙p͠r̼̞̻̭̗e̺̠̣͟s̘͇̳͍̝͉e͉̥̯̞̲͚̬͜ǹ̬͎͎̟̖͇̤t͍̬̤͓̼̭͘ͅi̪̱n͠g̴͉ ͏͉ͅc̬̟h͡a̫̻̯͘o̫̟̖͍̙̝͉s̗̦̲.̨̹͈̣');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (9, 9, 9, '11/7/2019', '3/4/2020', '<img src=x onerror=alert(''hi'') />');
insert into project_modules (ModuleID, ProjectID, EmployeeID, ProjectModulesDate, ProjectModulesOn, ProjectModulesDescription) values (10, 10, 10, '11/10/2019', '3/2/2020', ' ');

insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (1, 1, 'Lou Gosdin', '2/15/2020', '<svg><script>0<1>alert(''XSS'')</script>', '() { _; } >_[$($())] { touch /tmp/blns.shellshock2.fail; }', '3/10/2020');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (2, 2, 'Leontyne Franchyonok', '6/5/2020', '$1.00', '1E2', '8/31/2020');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (3, 3, 'Deedee Patise', '9/7/2020', '⁰⁴⁵₀₁₂', 'œ∑´®†¥¨ˆøπ“‘', '3/29/2020');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (4, 4, 'Bruno Kilbourne', '2/1/2020', '0/0', '👾 🙇 💁 🙅 🙆 🙋 🙎 🙍 ', '2/26/2020');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (5, 5, 'Barnabe Shitliff', '2/11/2020', 'ÅÍÎÏ˝ÓÔÒÚÆ☃', '1', '8/21/2020');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (6, 6, 'Idette Hulbert', '4/26/2020', '😍', '部落格', '6/26/2020');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (7, 7, 'Jarrett Diess', '8/13/2020', '˙ɐnbᴉlɐ ɐuƃɐɯ ǝɹolop ʇǝ ǝɹoqɐl ʇn ʇunpᴉpᴉɔuᴉ ɹodɯǝʇ poɯsnᴉǝ op pǝs ''ʇᴉlǝ ƃuᴉɔsᴉdᴉpɐ ɹnʇǝʇɔǝsuoɔ ''ʇǝɯɐ ʇᴉs ɹolop ɯnsdᴉ ɯǝɹo˥', '0️⃣ 1️⃣ 2️⃣ 3️⃣ 4️⃣ 5️⃣ 6️⃣ 7️⃣ 8️⃣ 9️⃣ 🔟', '2/25/2020');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (8, 8, 'Bel Ratcliff', '3/25/2020', '$1.00', '!@#$%^&*()', '11/24/2019');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (9, 9, 'Meggy Vize', '5/9/2020', '!@#$%^&*()', '-1E+02', '6/3/2020');
insert into Projects (ProjectID, ManagerID, ProjectName, ProjectStartDate, ProjectDescription, ProjectDetail, ProjectCompletedOn) values (10, 10, 'Eward Keune', '5/22/2020', '　', 'ÅÍÎÏ˝ÓÔÒÚÆ☃', '3/4/2020');

insert into ` Work`  (WorkDoneID, EmployeeID, ModuleID, WorkDoneDate, WorkDoneDescription, WorkDoneStatus) values (1, 1, 1, '3/31/2020', '"''"''"''''''''"', 1),
  (2, 2, 2, '9/20/2019', '../../../../../../../../../../../etc/passwd%00', 1),
 (3, 3, 3, '7/10/2020', '$1.00', 1),
(4, 4, 4, '7/28/2020', '⁰⁴⁵', 1),
(5, 5, 5, '3/2/2020', '''"''', 1),
(6, 6, 6, '6/18/2020', '😍', 0),
(7, 7, 7, '2/6/2020', 'Ṱ̺̺̕o͞ ̷i̲̬͇̪͙n̝̗͕v̟̜̘̦͟o̶̙̰̠kè͚̮̺̪̹̱̤ ̖t̝͕̳̣̻̪͞h̼͓̲̦̳̘̲e͇̣̰̦̬͎ ̢̼̻̱̘h͚͎͙̜̣̲ͅi̦̲̣̰̤v̻͍e̺̭̳̪̰-m̢iͅn̖̺̞̲̯̰d̵̼̟͙̩̼̘̳ ̞̥̱̳̭r̛̗̘e͙p͠r̼̞̻̭̗e̺̠̣͟s̘͇̳͍̝͉e͉̥̯̞̲͚̬͜ǹ̬͎͎̟̖͇̤t͍̬̤͓̼̭͘ͅi̪̱n͠g̴͉ ͏͉ͅc̬̟h͡a̫̻̯͘o̫̟̖͍̙̝͉s̗̦̲.̨̹͈̣', 1),
 (8, 8, 8, '12/13/2019', '｀ｨ(´∀｀∩', 1),
 (9, 9, 9, '4/3/2020', '사회과학원 어학연구소', 1),
(10, 10, 10, '12/2/2019', '̦H̬̤̗̤͝e͜ ̜̥̝̻͍̟́w̕h̖̯͓o̝͙̖͎̱̮ ҉̺̙̞̟͈W̷̼̭a̺̪͍į͈͕̭͙̯̜t̶̼̮s̘͙͖̕ ̠̫̠B̻͍͙͉̳ͅe̵h̵̬͇̫͙i̹͓̳̳̮͎̫̕n͟d̴̪̜̖ ̰͉̩͇͙̲͞ͅT͖̼͓̪͢h͏͓̮̻e̬̝̟ͅ ̤̹̝W͙̞̝͔͇͝ͅa͏͓͔̹̼̣l̴͔̰̤̟͔ḽ̫.͕', 1);



