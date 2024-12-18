Feature: examen apis

  @Escenario01
  Scenario Outline: Realizo una validacion exitosa del flujo un pedido de una mascota
    When consulto la mascota con ID <id> y petId <petId>


    Examples:
      | id | petId |
      | 1  | 3     |

  @Escenario0223
  Scenario Outline: Realizo una validacion exitosa del flujo un pedido de consulta de orden

    When consulto un pedido de orden <Orden1>

    Examples:
      | Orden1 |
      | 1      |

