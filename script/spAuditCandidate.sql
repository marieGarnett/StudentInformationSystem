USE SIS


GO

IF OBJECT_ID('spAuditCandidate') IS NOT NULL DROP PROCEDURE spAuditCandidate
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAuditCandidate @User VARCHAR(50), @Date DATE, @Time TIME, @Action VARCHAR(10), @Surname VARCHAR(25), @Firstname VARCHAR(25)
AS

DECLARE @Id INT
DECLARE @Candidate VARCHAR(100)
DECLARE @Message VARCHAR(250)

SELECT @Id = User_ID
FROM [user]
WHERE Username = @User

SET @Candidate = @Surname + ', ' + @Firstname
SET @Message = 'Successfully ' + @Action + ' ' + @Candidate + '.'

INSERT INTO audittrail(User_ID, Date, Time, Operation, AuditType_ID)
VALUES(@Id, @Date, @Time, @Message, '8')


GO

