--Given a lot of tables and key attributes including but not limited to
--      company table with name and company id
--      salary table with company id and salary

--Goal  return name of the company in company table whose average salary is larger than 40000

SELECT 
	COMPANY.NAME
FROM 
	SALARY
INNER JOIN COMPANY
ON SALARY.COMPANY_ID = COMPANY.ID
GROUP BY COMPANY.ID
WHERE AVG(SALARY.SALARY) > 40000;