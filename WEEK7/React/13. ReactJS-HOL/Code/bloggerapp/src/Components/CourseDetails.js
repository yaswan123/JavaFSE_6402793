import React from 'react'
import { course } from './Details'
function CourseDetails() {
  return (
    <div style={{display:'flex',flexDirection:'column',rowGap:'10px'}} >
      <h1>CourseDetails</h1>
      {course.map((courseDetail)=>(
        <div>
          <h2>{courseDetail.name}</h2>
          <h4>{courseDetail.date}</h4>
        </div>
      ))}
    </div>
  )
}

export default CourseDetails