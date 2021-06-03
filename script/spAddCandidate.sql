USE SIS


GO

IF OBJECT_ID('spAddCandidate') IS NOT NULL DROP PROCEDURE spAddCandidate
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAddCandidate @Surname VARCHAR(50), @Firstname VARCHAR(50),
	@Middlename VARCHAR(50), @Birthdate DATE, @Birthplace VARCHAR(250),
	@Gender VARCHAR(6), @StreetAdd VARCHAR(100), @CityAdd VARCHAR(100),
	@Phone VARCHAR(11), @Email VARCHAR(100), @PrevSchool VARCHAR(100), @PrevSchoolAdd VARCHAR(150),
	@DesiredCourse VARCHAR(150), @YearFrom INT, @YearTo INT, @YearLevel VARCHAR(50),
	@Mother VARCHAR(100), @Father VARCHAR(100), @Sibling VARCHAR(250),
	@Guardian VARCHAR(100), @GuardianAdd VARCHAR(100), @GuardianPhone INT
AS

DECLARE @CourseId INT

SELECT @CourseId = Course_ID
FROM course
WHERE CourseName = @DesiredCourse

INSERT INTO admission(Course_ID, Surname, Firstname, Middlename, Birthdate, Birthplace, Gender,
	StreetAddress, City, PhoneNumber, EmailAdress, PrevSchoolName, SchoolAdress,
	YearFrom, YearTo, YearLevel, MotherName, FatherName, Siblings, GuardianName,
	GuardianAdress, GuardianNumber)
	VALUES (@CourseId, @Surname, @Firstname, @Middlename, @Birthdate, @Birthplace, @Gender,
	@StreetAdd, @CityAdd, @Phone, @Email, @PrevSchool, @PrevSchoolAdd, @YearFrom, @YearTo,
	@YearLevel, @Mother, @Father, @Sibling, @Guardian, @GuardianAdd, @GuardianPhone)


GO
