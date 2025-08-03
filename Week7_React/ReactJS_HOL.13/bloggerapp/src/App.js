import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  const books = [
    { name: "Master React", price: 770 },
    { name: "Deep Dive into Angular 11", price: 300 },
    { name: "Mongo Essentials", price: 450 }
  ];

  return (
    <div style={{ padding: '20px' }}>
      <h1>Blogger App</h1>

      {/* Toggle Buttons */}
      <button onClick={() => setShowBooks(!showBooks)}>Toggle Book Details</button>
      <button onClick={() => setShowBlogs(!showBlogs)}>Toggle Blog Details</button>
      <button onClick={() => setShowCourses(!showCourses)}>Toggle Course Details</button>

      <hr />

      {/* Conditional Rendering Examples */}
      <div style={{ display: 'flex', gap: '30px' }}>
        {/* Method 1: Using && */}
        {showBooks && <BookDetails books={books} />}

        {/* Method 2: Using ternary */}
        {showBlogs ? <BlogDetails /> : <p>No Blogs to show</p>}

        {/* Method 3: Using if-else style logic */}
        {showCourses ? <CourseDetails /> : null}
      </div>
    </div>
  );
}

export default App;
