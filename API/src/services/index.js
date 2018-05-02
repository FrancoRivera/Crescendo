const users = require('./users/users.service.js');
const artists = require('./artists/artists.service.js');
const genres = require('./genres/genres.service.js');
module.exports = function (app) {
  app.configure(users);
  app.configure(artists);
  app.configure(genres);
};
