<%@page import="java.util.ArrayList"%>
<%@page import="entidades.DetalleVenta"%>
<%@page import="java.util.List"%>
<%@page import="entidades.Articulo"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Supermercado</title>

        <link
            href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
            rel="stylesheet">

        <!-- box icon-->
        <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>

        <!-- BOOTSTRAP -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- CSS -->
        <link href="css/sb-admin-2.css" rel="stylesheet">

    </head>

    <body id="page-top">
        <div id="wrapper">
            <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
                <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                    <div class="sidebar-brand-icon rotate-n-15">
                        <i class="fas fa-laugh-wink"></i>
                    </div>
                    <div class="sidebar-brand-text mx-3">Supermercado</div>
                </a>

                <hr class="sidebar-divider">
                <div class="sidebar-heading">
                    Menú
                </div>

                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                       aria-expanded="true" aria-controls="collapseTwo">
                        <i class="fas fa-fw fa-cog"></i>
                        <span>Compras</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                       aria-expanded="true" aria-controls="collapseUtilities">
                        <i class="fas fa-fw fa-wrench"></i>
                        <span>Ventas</span>
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                       aria-expanded="true" aria-controls="collapseUtilities">
                        <i class="fas fa-fw fa-wrench"></i>
                        <span>Kardex</span>
                    </a>
                </li>

            </ul>

            <!-- Content Wrapper -->
            <div id="content-wrapper" class="d-flex flex-column">

                <!-- Main Content -->
                <div id="content">

                    <!-- Topbar -->
                    <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">
                    </nav>
                    <!-- End of Topbar -->

                    <!-- Begin Page Content -->
                    <div class="container-fluid">

                        <!-- Page Heading -->
                        <div class="d-sm-flex align-items-center justify-content-between mb-4">
                            <h1 class="h3 mb-0 text-gray-800" style="width: 30%">Realizar Venta</h1>
                            <form action="ControlArticulo" method="POST" class="input-group mb-3">
                                <input type="text" name="txtDniClinete" placeholder="Buscar cliente por dni" class="form-control">
                                <input class="d-none d-sm-inline-block btn btn-sm btn-primary" type="submit" value="Buscar Cliente">
                            </form>
                        </div>
                        <!-- Content Row -->

                        <div class="row">
                            <!-- Area Chart -->
                            <div class="col-xl-8 col-lg-7">
                                <div class="card shadow mb-4">
                                    <!-- Card Header - Dropdown -->
                                    <div
                                        class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                        <h6 class="m-0 font-weight-bold text-primary">Detalle Venta</h6>
                                    </div>
                                    <div class="card-body">
                                        <table class="table table-hover">
                                            <thead>
                                                <tr>
                                                    <th>ID Producto</th>
                                                    <th>Cantidad</th>
                                                    <th>SubTotal</th>
                                                    <th>Accion</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                List<DetalleVenta> carrito = request.getAttribute("LISTADETALLEVENTA") == null ? new ArrayList<DetalleVenta>() : (List<DetalleVenta>)request.getAttribute("LISTADETALLEVENTA");
                                                for(DetalleVenta detalle : carrito){
                                                    %>
                                                    <tr>
                                                        <td><%=detalle.getIdArticulo()%></td>
                                                        <td><%=detalle.getCantidad()%></td>
                                                        <td><%=detalle.getSubTotal()%></td>
                                                        <td><input class="btn btn-danger" value="Eliminar"></td>
                                                    </tr>
                                                    <%
                                                }
                                                %>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>

                            <!-- Pie Chart -->
                            <div class="col-xl-4 col-lg-5">
                                <div class="card shadow mb-4">
                                    <!-- Card Header - Dropdown -->
                                    <div
                                        class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
                                        <h6 class="m-0 font-weight-bold text-primary">Buscar Articulo</h6>
                                    </div>
                                    <div class="card-body">
                                        <div class="row">
                                            <form action="ControlArticulo" method="POST" class="input-group mb-3">
                                                <input type="hidden" name="accion" value="BUSCAR">
                                                <input type="text" name="txtIdArticulo" placeholder="Buscar articulo" class="form-control">
                                                <input type="submit" value="Buscar" class="btn btn-info">
                                            </form>
                                        </div>
                                        <div class="row">
                                            <%
                                                Articulo articulo = (Articulo) request.getAttribute("articulobuscado");
                                                if (articulo != null) {
                                            %>
                                                    <p>ID: <span><%=articulo.getIdArticulo()%></span></p>
                                                    <p>Nombre: <span><%=articulo.getNombreArt()%></span></p>
                                                    <p>Precio: <span><%=articulo.getPrecio()%></span></p>
                                                    <p>Stock: <span><%=articulo.getStock()%></span></p>
                                                    <form method="POST" action="ControllDetalleVenta">
                                                        <p class="input-group">
                                                            <input type="hidden" name="txtIdArtCarrito" value="<%=articulo.getIdArticulo()%>">
                                                            <input type="hidden" name="accion" value="AGREGARCARRITO">
                                                            <input type="text" placeholder="Ingresar cantidad" name="txtCantidad" class="form-control">
                                                            <span class="input-group-text">Cantidad</span>
                                                        <p><input type="submit" value="Agregar" class="btn btn-success"></p>
                                                    </form>
                                            <%
                                                }
                                            %>
                                        </div>
                                    </div>
                                </div>  
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <!--BOOTSTRAP-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Custom scripts for all pages-->
        <script src="js/sb-admin-2.min.js"></script>
    </body>
</html>