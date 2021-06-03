USE SIS


GO

IF OBJECT_ID('spAddStudent') IS NOT NULL DROP PROCEDURE spAddStudent
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE spAddStudent @CandidateName VARCHAR(200)
AS

DECLARE @Admission_ID INT
DECLARE @Course_ID INT

SELECT @Admission_ID = Admission_ID, @Course_ID = Course_ID
FROM admission
WHERE CONCAT(Surname, ', ', Firstname, ' ', Middlename) = @CandidateName
AND IsEnrolled = 0

IF @Course_ID IS NOT NULL
BEGIN
	UPDATE admission
	SET IsEnrolled = '1'
	WHERE Admission_ID = @Admission_ID
	
	INSERT INTO student(Course_ID, Admission_ID, IsActive)
	VALUES(@Course_ID, @Admission_ID, '1')
END


GO

