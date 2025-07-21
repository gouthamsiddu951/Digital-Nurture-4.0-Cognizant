import React from 'react';

function CourseList({ courses }) {
  return (
    <ul>
      {courses.map(course => (
        <li key={course.id}>
          {course.name} - Instructor: {course.instructor}
        </li>
      ))}
    </ul>
  );
}

export default CourseList;
