const express = require("express");
const users = require("./public03/users");

const port = 3000;
const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));

app.get("/users", (req, res, next) => {
  res.send(users.showUsers());
});

app.get("/users/:id", (req, res, next) => {
  const { id } = req.params;
  const user = users.findUser(parseInt(id));
  res.send(user);
});

app.post("/users", (req, res, next) => {
  const { name } = req.body;
  const newUser = users.addUser(name);
  res.send(newUser);
});

app.delete("/users/:id", (req, res, next) => {
  const { id } = req.params;
  const removed = users.removeUser(parseInt(id));
  if (removed) {
    res.send("Usuário removido");
  } else {
    res.send("Usuário não encontrado");
  }
});

app.put("/users/:id", (req, res, next) => {
  const { id } = req.params;
  const { name } = req.body;
  const updated = users.updateUser(parseInt(id), name);
  if (updated) {
    res.send("Usuário removido");
  } else {
    res.send("Usuário não encontrado");
  }
});

app.listen(port, () => {
  console.log(`Server is running on port ${port}`);
});
