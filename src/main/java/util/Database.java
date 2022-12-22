package util;

import java.util.Collections;
import java.util.List;

public class Database {

    public static List<Videogame> videogames;

    static {
        videogames = List.of(
                Videogame.builder()
                        .nombre("Forza horizon 5")
                        .precio(50.06)
                        .consola(Console.XBOX)
                        .reseñas(List.of(
                                new Review("Is the best", 5),
                                new Review("Is the best but expensive", 4),
                                new Review("Is the best x2", 5)
                        ))
                        .sitioOficial("www.forza.com")
                        .enDescuento(false)
                        .ventasTotales(74)
                        .build(),
                Videogame.builder()
                        .nombre("Residen evil 4")
                        .precio(55.20)
                        .consola(Console.ALL)
                        .reseñas(List.of(
                                new Review("Is the best", 5),
                                new Review("Is the best x2", 4),
                                new Review("Is the best x3", 5),
                                new Review("Is the best x4", 5)
                        ))
                        .sitioOficial("www.rs4.com")
                        .enDescuento(true)
                        .ventasTotales(96)
                        .build(),
                Videogame.builder()
                        .nombre("Assassins creed origins")
                        .precio(15.55)
                        .consola(Console.ALL)
                        .reseñas(List.of(
                                new Review("Is the best Assassins ", 5)
                        ))
                        .sitioOficial("www.origins.com")
                        .enDescuento(false)
                        .ventasTotales(65)
                        .build(),
                Videogame.builder()
                        .nombre("Assassins creed odisey")
                        .precio(15.55)
                        .consola(Console.ALL)
                        .reseñas(List.of(
                                new Review("Is the best Assassins ", 5),
                                new Review("Is the best Assassins x2 ", 5),
                                new Review("Is the best Assassins  x3", 5)
                        ))
                        .sitioOficial("www.odisey.com")
                        .enDescuento(false)
                        .ventasTotales(33)
                        .build(),
                Videogame.builder()
                        .nombre("Assassins creed valhalla")
                        .precio(30.33)
                        .consola(Console.ALL)
                        .reseñas(List.of(
                                new Review("Is great Assassins ", 4),
                                new Review("Is great Assassins x2 ", 3),
                                new Review("Is great Assassins  x3", 4),
                                new Review("Is great Assassins  x4", 5)
                        ))
                        .sitioOficial("www.valhalla.com")
                        .enDescuento(false)
                        .ventasTotales(78)
                        .build(),
                Videogame.builder()
                        .nombre("GTA 5")
                        .precio(25.5)
                        .consola(Console.ALL)
                        .reseñas(List.of(
                                new Review("Is the best", 4)
                        ))
                        .sitioOficial("www.gta.com")
                        .enDescuento(true)
                        .ventasTotales(140)
                        .build(),
                Videogame.builder()
                        .nombre("Crash 4")
                        .precio(50.06)
                        .consola(Console.ALL)
                        .reseñas(List.of(
                                new Review("Is too short", 2),
                                new Review("Is too short x2", 1)
                        ))
                        .sitioOficial("www.crash.com")
                        .enDescuento(false)
                        .ventasTotales(188)
                        .build(),
                Videogame.builder()
                        .nombre("Forza horizon 4")
                        .precio(10.06)
                        .consola(Console.XBOX)
                        .reseñas(Collections.emptyList())
                        .sitioOficial("www.forza.com")
                        .enDescuento(false)
                        .ventasTotales(52)
                        .build(),
                Videogame.builder()
                        .nombre("The last of us")
                        .precio(40.06)
                        .consola(Console.PLAYSTATION)
                        .reseñas(List.of(
                                new Review("Is the best", 5),
                                new Review("When launch the part 3???", 5)
                        ))
                        .sitioOficial("www.last-of-us.com")
                        .enDescuento(false)
                        .ventasTotales(41)
                        .build(),
                Videogame.builder()
                        .nombre("Good of war")
                        .precio(28.00)
                        .consola(Console.PLAYSTATION)
                        .reseñas(List.of(
                                new Review("not very good", 3),
                                new Review("not like me", 2),
                                new Review("not very good x2", 2)
                        ))
                        .sitioOficial("www.forza.com")
                        .enDescuento(false)
                        .ventasTotales(79)
                        .build(),
                Videogame.builder()
                        .nombre("Halo")
                        .precio(50.06)
                        .consola(Console.XBOX)
                        .reseñas(List.of(new Review("Is the best", 4)))
                        .sitioOficial("www.halo.com")
                        .enDescuento(false)
                        .ventasTotales(14)
                        .build(),
                Videogame.builder()
                        .nombre("Mario bros")
                        .precio(55.99)
                        .consola(Console.NINTENDO)
                        .reseñas(List.of(new Review("nintendo is the best", 5)))
                        .sitioOficial("www.mario.com")
                        .enDescuento(false)
                        .ventasTotales(64)
                        .build(),
                Videogame.builder()
                        .nombre("Geometry dash pc")
                        .precio(0.99)
                        .consola(Console.PC)
                        .reseñas(List.of(
                                new Review("some comment", 5),
                                new Review("some comment", 2),
                                new Review("some comment", 4),
                                new Review("some comment", 4))
                        )
                        .sitioOficial("www.g.com")
                        .enDescuento(false)
                        .ventasTotales(236)
                        .build(),
                Videogame.builder()
                        .nombre("Luigi mansion")
                        .precio(50.06)
                        .consola(Console.NINTENDO)
                        .reseñas(Collections.emptyList())
                        .sitioOficial("www.mario.com")
                        .enDescuento(false)
                        .ventasTotales(49)
                        .build(),
                Videogame.builder()
                        .nombre("Mario party")
                        .precio(22.00)
                        .consola(Console.NINTENDO)
                        .reseñas(List.of(new Review("Too boring", 1)))
                        .sitioOficial("www.mario.com")
                        .enDescuento(false)
                        .ventasTotales(4)
                        .build(),
                Videogame.builder()
                        .nombre("COD black ops")
                        .precio(18.60)
                        .consola(Console.PLAYSTATION)
                        .reseñas(List.of(new Review("5 Stars", 5), new Review("5 Stars", 5)))
                        .sitioOficial("www.cod.com")
                        .enDescuento(false)
                        .ventasTotales(900)
                        .build(),
                Videogame.builder()
                        .nombre("COD black mobile")
                        .precio(0.0)
                        .consola(Console.MOBILE)
                        .reseñas(List.of(new Review("4 Stars", 4)))
                        .sitioOficial("www.cod.com")
                        .enDescuento(false)
                        .ventasTotales(1200)
                        .build(),
                Videogame.builder()
                        .nombre("Geometry dash")
                        .precio(1.0)
                        .consola(Console.MOBILE)
                        .reseñas(List.of(
                                new Review("amazing", 5),
                                new Review("funny", 4),
                                new Review("ok", 5),
                                new Review("amazing2", 5),
                                new Review("funny2", 4),
                                new Review("ok2", 5)))
                        .sitioOficial("www.geometry.com")
                        .enDescuento(true)
                        .ventasTotales(2000)
                        .build(),
                Videogame.builder()
                        .nombre("Candy crush")
                        .precio(0.0)
                        .consola(Console.MOBILE)
                        .reseñas(List.of(
                                new Review("", 5),
                                new Review("", 3),
                                new Review("", 3),
                                new Review("", 3),
                                new Review("", 3),
                                new Review("", 2)))
                        .sitioOficial("www.candy-crush.com")
                        .enDescuento(false)
                        .ventasTotales(2200)
                        .build(),
                Videogame.builder()
                        .nombre("Forza horizon 5")
                        .precio(50.06)
                        .consola(Console.XBOX)
                        .reseñas(List.of(
                                new Review("Is the best", 5),
                                new Review("Is the best but expensive", 4),
                                new Review("Is the best x2", 5)
                        ))
                        .sitioOficial("www.forza.com")
                        .enDescuento(false)
                        .ventasTotales(74)
                        .build()
        );
    }
}
