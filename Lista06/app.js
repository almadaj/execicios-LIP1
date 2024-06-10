const express = require("express");
const bodyParser = require("body-parser");
const fs = require("fs");
const path = require("path");

const port = 3000;
const app = express();

var urlencodedParser = bodyParser.urlencoded({ extended: true });
app.use(express.static(path.join(__dirname, "public")));

app.get("/", (req, res) => {
  fs.readFile("public/index.html", (err, data) => {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.write(data);
    res.end;
  });
});

app.post("/form", urlencodedParser, function (req, res) {
  fs.readFile("public/form.html", function (err, data) {
    var today = new Date();
    var values = {
      name: req.body.name,
      year: req.body.birthYear,
      age: today.getFullYear() - parseInt(req.body.birthYear),
    };
    for (var key in values) {
      data = data.toString().replace("{{" + key + "}}", values[key]);
    }
    res.writeHead(200, { "Content-Type": "text/html" });
    res.write(data);
    res.end();
  });
});
app.listen(port, () => {
  console.log(`Servidor na porta ${port}`);
});
