CREATE TABLE Patient (
    PatientId int IDENTITY(1,1) PRIMARY KEY,
    Title varchar(255) not null,
    FirstName varchar(255) not null,
    MiddleName varchar(255) not null,
    LastName varchar(255) not null,
    DateOfBirth varchar(255) not null,
    Gender varchar(255) not null,
    HomeAddress varchar(255) not null,
    PhoneNumber varchar(25) not null,
	  Age int not null,
	  AdmissionDate varchar(255) not null,
	  History varchar(255) not null,
	  Prescriptions varchar(255) not null,
	  Allergies varchar(255) not null,
	  SpecialRequests varchar(255) not null
);