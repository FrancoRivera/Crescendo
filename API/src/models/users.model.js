const NeDB = require('nedb');
const path = require('path');

module.exports = function (app) {
  const dbPath = app.get('nedb');
  const Model = new NeDB({
    filename: path.join(dbPath, 'users.db'),
    autoload: true,
    paginate: {
      default: 100,
      max: 200
    }
  });

  Model.ensureIndex({ fieldName: 'email', unique: true });

  return Model;
};
