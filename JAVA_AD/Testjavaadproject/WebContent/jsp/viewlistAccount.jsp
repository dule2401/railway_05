<div class="container-lg">
  <div class="table-responsive">
      <div class="table-wrapper">
          <div class="table-title">
              <div class="row">
                  <div class="col-sm-8">
                      <h2>View List Employees</h2>
                  </div>
                  <div class="col-sm-4">
                      <button type="button" class="btn btn-info add-new" onclick="addNewEmployee()"><i class="fa fa-plus"></i> Add New</button>
                  </div>
              </div>
          </div>
          <table class="table table-bordered">
              <thead>
                  <tr>
                      <th>Name</th>
                      <th>Department</th>
                      <th>Phone</th>
                      <!-- <th>Actions</th> -->
                  </tr>
              </thead>
              <tbody>
                  <!-- <tr>
                      <td>John Doe</td>
                      <td>Administration</td>
                      <td>(171) 555-2222</td>
                      <td>
                          <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
                          <a class="edit" title="Edit" data-toggle="tooltip"><i
                                  class="material-icons">&#xE254;</i></a>
                          <a class="delete" title="Delete" data-toggle="tooltip"><i
                                  class="material-icons">&#xE872;</i></a>
                      </td>
                  </tr>
                  <tr>
                      <td>Peter Parker</td>
                      <td>Customer Service</td>
                      <td>(313) 555-5735</td>
                      <td>
                          <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
                          <a class="edit" title="Edit" data-toggle="tooltip"><i
                                  class="material-icons">&#xE254;</i></a>
                          <a class="delete" title="Delete" data-toggle="tooltip"><i
                                  class="material-icons">&#xE872;</i></a>
                      </td>
                  </tr>
                  <tr>
                      <td>Fran Wilson</td>
                      <td>Human Resources</td>
                      <td>(503) 555-9931</td>
                      <td>
                          <a class="add" title="Add" data-toggle="tooltip"><i class="material-icons">&#xE03B;</i></a>
                          <a class="edit" title="Edit" data-toggle="tooltip"><i
                                  class="material-icons">&#xE254;</i></a>
                          <a class="delete" title="Delete" data-toggle="tooltip"><i
                                  class="material-icons">&#xE872;</i></a>
                      </td>
                  </tr> -->
              </tbody>
          </table>
      </div>
  </div>
</div>

<div class="bs-example">
  <div id="myModal" class="modal fade" tabindex="-1">
      <div class="modal-dialog">
          <div class="modal-content">
              <div class="modal-header">
                  <h5 class="modal-title">Add new Employee</h5>
                  <button type="button" class="close" data-dismiss="modal">&times;</button>
              </div>
              <div class="modal-body">
                  <label for="name"><b>Name</b></label>
                  <input type="text" placeholder="Enter Name" name="name" id="name" required>

                  <label for="department"><b>Department</b></label>
                  <input type="text" placeholder="Enter Department" name="department" id="department" required>

                  <label for="phone"><b>Phone</b></label>
                  <input type="tel" placeholder="Enter Phone Number" name="phone" id="phone" required>
              </div>
              <div class="modal-footer">
                  <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                  <button type="button" class="btn btn-primary" onclick="saveNewEmployee()">Save</button>
              </div>
          </div>
      </div>
  </div>
</div>