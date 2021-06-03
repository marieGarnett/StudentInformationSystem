USE SIS


GO

IF OBJECT_ID('spAuditLogOut') IS NOT NULL DROP PROCEDURE spAuditLogOut
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE [dbo].spAuditLogOut @User VARCHAR(50), @Date DATE, @Time TIME, @Message VARCHAR(50)
AS

	DECLARE @Id INT
	DECLARE @AuditType_ID INT

	SELECT @Id = User_ID
	FROM [user]
	WHERE Username = @User
		OR Email = @User

	SELECT @AuditType_ID = AuditType_ID
	FROM auditType
	WHERE AuditName = 'User Log Out'

	INSERT INTO audittrail(User_ID, Date, Time, Operation, AuditType_ID)
	VALUES(@Id, @Date, @Time, @Message, @AuditType_ID)


GO

