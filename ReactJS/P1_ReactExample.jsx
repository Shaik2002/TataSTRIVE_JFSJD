import React from "react";

function StudentTable() {
    return (
        <div>
            <h2>Student Details</h2>
            <table border="1">
                <thead>
                    <tr>
                        <th>Image</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Course</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><img src="https://cdn.pixabay.com/photo/2020/08/08/19/25/student-5473769_1280.png" alt="Student" /></td>
                        <td>Shaik</td>
                        <td>22</td>
                        <td>CSE</td>
                    </tr>
                    <tr>
                        <td><img src="https://cdn.pixabay.com/photo/2020/08/08/19/25/student-5473769_1280.png" alt="Student" /></td>
                        <td>Mohammed</td>
                        <td>23</td>
                        <td>ECE</td>
                    </tr>
                    <tr>
                        <td><img src="https://cdn.pixabay.com/photo/2020/08/08/19/25/student-5473769_1280.png" alt="Student" /></td>
                        <td>Ibrahim</td>
                        <td>22</td>
                        <td>IT</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

function ProfessorTable() {
    return (
        <div>
            <h2>Professor Details</h2>
            <table border="1">
                <thead>
                    <tr>
                        <th>Image</th>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Department</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><img src="https://cdn.pixabay.com/photo/2016/04/01/11/11/boy-1300242_1280.png" alt="Professor" /></td>
                        <td>Dr. James</td>
                        <td>58</td>
                        <td>Computer Science</td>
                    </tr>
                    <tr>
                        <td><img src="https://cdn.pixabay.com/photo/2016/04/01/11/11/boy-1300242_1280.png" alt="Professor" /></td>
                        <td>Dr. Smith</td>
                        <td>52</td>
                        <td>Electronics</td>
                    </tr>
                </tbody>
            </table>
        </div>
    );
}

function Example() {
    return (
        <div>
            <StudentTable/>
            <ProfessorTable/>
        </div>
    );
}

export default Example;
