import React from 'react'
import {books} from './Details'
function BookDetails() {
  return (
    <div style={{display:'flex',flexDirection:'column',rowGap:'10px'}}>
      <h1>BookDetails</h1>
      {books.map((book)=>(
        <div>
          <h2>{book.id} - {book.bname}</h2>
          <h4>{book.price}</h4>
        </div>
      ))}
    </div>
  )
}

export default BookDetails