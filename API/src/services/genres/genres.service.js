// Initializes the `genres` service on path `/genres`
const createService = require('feathers-nedb');
const createModel = require('../../models/genres.model');
const hooks = require('./genres.hooks');

module.exports = function (app) {
  const Model = createModel(app);
  const paginate = app.get('paginate');

  const options = {
    name: 'genres',
    Model,
    paginate
  };

  // Initialize our service with any options it requires
  app.use('/genres', createService(options));

  // Get our initialized service so that we can register hooks and filters
  const service = app.service('genres');

  service.hooks(hooks);
};
