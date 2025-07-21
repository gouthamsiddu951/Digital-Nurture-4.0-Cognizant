import React, { useState } from 'react';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';
import CourseList from './CourseList';

function App() {
  const [selected, setSelected] = useState("book");
  const [showCourses, setShowCourses] = useState(true);

  const renderSelectedComponent = () => {
    if (selected === "book") return <BookDetails />;
    return selected === "blog" ? <BlogDetails /> : null;
  };

  let courseComponent;
  if (showCourses) {
    courseComponent = <CourseDetails />;
  }

  const renderComponentBySwitch = () => {
    switch (selected) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return <h3>No component selected</h3>;
    }
  };

  const courseData = [
    { id: 1, name: "React Basics", instructor: "John" },
    { id: 2, name: "Advanced JS", instructor: "Jane" },
    { id: 3, name: "CSS Mastery", instructor: "Alice" }
  ];

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>Welcome to Blogger App</h1>

      <h2>Rendering List with map() and keys</h2>
      <CourseList courses={courseData} />

      <div>
        <button onClick={() => setSelected("book")}>Book</button>
        <button onClick={() => setSelected("blog")}>Blog</button>
        <button onClick={() => setSelected("course")}>Course</button>
      </div>

      <hr />
      <h2>Method 1 & 2 (if-else & ternary)</h2>
      {renderSelectedComponent()}

      <h2>Method 3 (Element variable)</h2>
      {courseComponent}

      <h2>Method 4 (Switch-case)</h2>
      {renderComponentBySwitch()}

      <br />
      <button onClick={() => setShowCourses(!showCourses)}>
        Toggle Course Visibility
      </button>
    </div>
  );
}

export default App;
