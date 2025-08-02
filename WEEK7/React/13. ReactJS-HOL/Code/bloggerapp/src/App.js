
import BlogDetails from './Components/BlogDetails';
import BookDetails from './Components/BookDetails';
import CourseDetails from './Components/CourseDetails';
import logo from './logo.svg';
import './App.css'

function App() {
  return (
    <div style={{display:'flex',columnGap:'100px',padding:'50px',justifyContent:'center'}}>
      <div className='border'>
        <CourseDetails />
      </div>
      <div className='border'>
        <BookDetails />
      </div>
      <div className='border'>
          <BlogDetails />
      </div>
    </div>
  );
}

export default App;
