USE SIS


GO

IF OBJECT_ID('spAuditAppClosed') IS NOT NULL DROP PROCEDURE spAuditAppClosed
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAuditAppClosed @Fullname VARCHAR(300), @Date DATE, @Time TIME, @Action VARCHAR(200)
AS

	DECLARE @User_ID INT
	DECLARE @Message VARCHAR(250)

	SELECT @User_ID = User_ID
	FROM [employee] JOIN [user]
	ON [employee].Employee_ID = [user].Employee_ID
	WHERE CONCAT(Firstname, ' ', Middlename, ' ', Lastname, ' ', Suffix) = @Fullname

	SET @Message = 'Successfully ' + @Action

	INSERT INTO audittrail(User_ID, Date, Time, Operation, AuditType_ID)
	VALUES (@User_ID, @Date, @Time, @Message, '24')

GO

