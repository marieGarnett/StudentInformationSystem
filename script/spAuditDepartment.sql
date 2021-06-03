USE SIS


GO

IF OBJECT_ID('spAuditDepartment') IS NOT NULL DROP PROCEDURE spAuditDepartment
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAuditDepartment @User VARCHAR(50), @Date DATE, @Time TIME, @Action VARCHAR(10), @Department VARCHAR(50)
AS

DECLARE @Id INT
DECLARE @Message VARCHAR(200)

SELECT @Id = User_ID
FROM [user]
WHERE Username = @User

SET @Message = 'Successfully ' + @Action + ' ' + @Department + '.'

INSERT INTO audittrail(User_ID, Date, Time, Operation)
VALUES(@Id, @Date, @Time, @Message)


GO
