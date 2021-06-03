USE SIS


GO

IF OBJECT_ID('spViewUser') IS NOT NULL DROP PROCEDURE spViewUser
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spViewUser @Username VARCHAR(50)
AS

SELECT CONCAT(Firstname, ' ', Middlename, ' ', Lastname, ' ', Suffix) AS Fullname, Email, UserType
FROM employee INNER JOIN [user]
ON employee.Employee_ID = [user].Employee_ID
WHERE Username = @Username;


GO
