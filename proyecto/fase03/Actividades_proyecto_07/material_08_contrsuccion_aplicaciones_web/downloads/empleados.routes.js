/**
 *
 * creamos un m�dulo por eso utilizamos express
 */

 const express = require('express');
 const router = express.Router();
 const empleadoCtrl = require('../controllers/empleado.controller');
  
 router.get('/', empleadoCtrl.getEmpleados); // Rutas m�s limpias (obtener empleados)
 router.post('/', empleadoCtrl.createEmpleados);//guardar
 router.get('/:id', empleadoCtrl.getUnicoEmpleado);// obtiene un �nico empleado
 router.put('/:id',empleadoCtrl.editarEmpleado);   //Actualizar datos (uno a la vez)
 router.delete('/:id', empleadoCtrl.eliminarEmpleado);
 
 module.exports = router;
