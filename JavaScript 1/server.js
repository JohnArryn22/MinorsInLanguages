const express = require('express')
const path = require('path')
const app = express()
const multer  = require('multer')
const {mergePDFs} = require('./merge');

const upload = multer({ dest: 'uploads/' })
app.use('/static', express.static('public'))
const port = 3000

app.get('/', (req, res) => {
  res.sendFile(path.join( __dirname , "templates/index.html"));
})

// we will install a package multer here it will help to upload multiple files in node.js ,, The next code is taken from the multer package documentation
app.post('/merge', upload.array('pdfs' , 2), async (req, res, next) => {
    console.log(req.files)
    // this mergepdfs function is taken from a package 
    let d = await mergePDFs(path.join(__dirname, req.files[0].path) , path.join(__dirname, req.files[1].path));
    res.redirect(`http://localhost:3000/static/${d}.pdf`);
    // res.send({data: req.files})
    // req.file is the `avatar` file
    // req.body will hold the text fields, if there were any
  })

app.listen(port, () => {
  console.log(`Example app listening on port http://localhost:${port}`)
})