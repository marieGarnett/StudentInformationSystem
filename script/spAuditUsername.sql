USE SIS


GO

IF OBJECT_ID('spAuditUsername') IS NOT NULL DROP PROCEDURE spAuditUsername
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAuditUsername @User VARCHAR(50), @Date DATE, @Time TIME, @Action VARCHAR(50)
AS

	DECLARE @Id INT
	DECLARE @Message VARCHAR(200)
	DECLARE @AuditType_ID INT

	SELECT @Id = User_ID
	FROM [user]
	WHERE Username = @User

	SELECT @AuditType_ID = AuditType_ID
	FROM auditType
	WHERE AuditName = 'User Alias'

	SET @Message = 'Successfully ' + @Action + ' ' + @User + '.'

	INSERT INTO audittrail(User_ID, Date, Time, Operation, AuditType_ID)
	VALUES(@Id, @Date, @Time, @Message, @AuditType_ID)


GO

