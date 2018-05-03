import fs from "fs";
import users from "./users";
import faker from "faker";

const updatedUsers = users.map(u => ({
  ...u,
  age: faker.random.number({ min: 18, max: 50 })
}));

const JSONStream = JSON.stringify(updatedUsers, null, 2);
fs.writeFile("users.json", JSONStream, "utf8", err => {
  if (err) {
    throw new Error(err.message);
  }
});
