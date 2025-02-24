class Company
{
    public void EmployeeDetails(String Ename , int EId , int Esalary , String Erole )
    {
        System.out.println("Details of Employees");
        System.out.println("EmployeeName - "+Ename+", EmployeeID - "+EId+", Salary - "+Esalary+" and Role - "+Erole);
    }
    public void DepartmentDetails(String Dname , int DId , int TotalEmployees , double Dphone )
    {
        System.out.println("Details of Departments");
        System.out.println("DepartmentName - "+Dname+", DepartmentID - "+DId+", Total Number of Employees - "+TotalEmployees+" and Department Phone - "+Dphone);
    }
}
class PP3_ClassMethodsObjects_EmployeeDetails {
    public static void main(String[] args) {
        Company obj1 = new Company();
        obj1.EmployeeDetails("RAJ" , 22101 , 23300 , ".NET Developer");
        obj1.EmployeeDetails("Sam" , 22102 , 52000 , "Sr. Consultant");
        Company obj2 = new Company();
        obj2.DepartmentDetails("Technology" , 101 , 23 , 12345L);
        obj2.DepartmentDetails("HumanResource" , 102 , 14 , 12345L);
    }
}

