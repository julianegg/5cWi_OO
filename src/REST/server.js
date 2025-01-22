const express = require("express");
const bodyParser = require("body-parser");
const cors = require("cors");

const app = express();
const port = 3000;

let persons = [
  {
    id: 1,
    firstname: "John",
    lastname: "Doe",
    age: 25,
  },
  {
    id: 2,
    firstname: "Jane",
    lastname: "Smith",
    age: 30,
  },
  {
    id: 3,
    firstname: "Michael",
    lastname: "Johnson",
    age: 35,
  },
  {
    id: 4,
    firstname: "Emily",
    lastname: "Davis",
    age: 28,
  },
  {
    id: 5,
    firstname: "Chris",
    lastname: "Brown",
    age: 40,
  },
];

app.use(cors());

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.get("/people", (req, res) => {
  res.send(persons);
});

app.post("/people", (req, res) => {
  const person = req.body;
  person.id = persons.length + 1;
  persons.push(person);
  res.json(person);
});
app.delete("/people/:id", (req, res) => {
  const id = parseInt(req.params.id);
  persons = persons.filter(person => person.id !== id);
  res.json({ message: "Person deleted successfully" });
});

app.put("/people/:id", (req, res) => {
  const id = +req.params.id;
  const person  = persons.find(person => person.id === id);
  if (person) {
    Object.assign(person, req.body);
    res.json(person);
  } else {
    res.status(404).send('Not found');
  }
});


app.listen(port, () =>
  console.log(`Hello world app listening on port ${port}!`)
);
