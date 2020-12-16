const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const cors = require('cors');

const port =3000;

// app.get('/',(req,res) =>{
// res.send("hello world");
// });

// Where we will keep books
let books = [];
app.use(cors());
// Configuring body parser middleware
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.post('/book', (req, res) => {

    const book = req.body;
// Output the book to the console for debugging
    console.log(book);
    books.push(book);
    res.send('Book is added to the database')
    

});

app.get('/book', (req, res) => {
    res.json(books);
    });
    
app.listen(port, () => console.log(`Hello world app listening on port ${port}!`));

