var users = [
  { _id: 1, name: "João" },
  { _id: 2, name: "Maria" },
  { _id: 3, name: "Pedro" },
  { _id: 4, name: "Ana" },
];

function addUser(name) {
  const id = users.length + 1;
  let newUser = { _id: id, name };
  users.push(newUser);
  return newUser;
}

function showUsers() {
  return users;
}

function findUser(id) {
  return users.find((user) => user._id === id);
}

function removeUser(id) {
  const index = user.findIndex((users) => user._id === id);
  if (index === -1) {
    return false;
  } else {
    users.splice(index, 1);
    return true;
  }
}

function updateUser(id, name) {
  const index = users.findIndex((user) => user._id === id);
  if (index === -1) {
    return false;
  } else {
    users[index].name = name;
    return true;
  }
}

module.exports = {
  users,
  addUser,
  findUser,
  showUsers,
  removeUser,
  updateUser,
};
