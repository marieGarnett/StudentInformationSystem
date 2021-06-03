USE SIS


GO

IF OBJECT_ID('spAuditCourse') IS NOT NULL DROP PROCEDURE spAuditCourse
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAuditCourse @User VARCHAR(50), @Date DATE, @Time TIME, @Action VARCHAR(10), @Course VARCHAR(200)
AS

DECLARE @Id INT
DECLARE @Message VARCHAR(200)

SELECT @Id = User_ID
FROM [user]
WHERE Username = @User

SET @Message = 'Successfully ' + @Action + ' ' + @Course + '.'

INSERT INTO audittrail(User_ID, Date, Time, Operation)
VALUES(@Id, @Date, @Time, @Message)


GO
