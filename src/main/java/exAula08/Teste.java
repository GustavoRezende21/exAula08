/*
 * Copyright (C) 2024 Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package exAula08;

/**
 *
 * @author Gustavo Rezende <gustavorezendegabriel@hotmail.com>
 * @date 13/03/2024
 * @brief Class Teste
 */
import java.util.*;

public class Teste {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        String color;
        double lado1, lado2, raioC, alturaT, baseT;
        int opcao;
        opcao = 0;
        while (opcao != 5) {
            System.out.println("");
            System.out.println("");
            System.out.println("Escolha uma Figura geométrica: \n"
                    + "1  ­Triângulo; \n"
                    + "2 ­ Retângulo; \n"
                    + "3 ­ Quadrado; \n"
                    + "4 ­ Circulo; \n"
                    + "5 ­ sair;");

            opcao = ler.nextInt();
            System.out.println("");
            System.out.println("");
            if (opcao == 1) {
                System.out.println("Informe a base do triângulo: ");
                baseT = ler.nextDouble();

                System.out.println("Informe a altura do triângulo: ");
                alturaT = ler.nextDouble();

                System.out.println("Informe a cor do triângulo: ");
                color = ler.next();

                Triangulo triangulo = new Triangulo(color, baseT, alturaT);
                System.out.println(triangulo);

            } else if (opcao == 2) {
                System.out.println("Informe o lado1 do retângulo: ");
                lado1 = ler.nextDouble();

                System.out.println("Informe o lado2 do retângulo: ");
                lado2 = ler.nextDouble();

                System.out.println("Informe a cor do retângulo: ");
                color = ler.next();

                Retangulo retangulo = new Retangulo(color, lado1, lado2);
                System.out.println(retangulo);

            } else if (opcao == 3) {
                System.out.println("Informe o lado do quadrado: ");
                lado1 = ler.nextDouble();

                System.out.println("Informe a cor do quadrado: ");
                color = ler.next();

                lado2 = lado1;

                Quadrado quadrado = new Quadrado(color, lado1, lado2);
                System.out.println(quadrado);

            } else if (opcao == 4) {
                System.out.println("Informe o raio do círculo: ");
                raioC = ler.nextDouble();

                System.out.println("Informe a cor do círculo: ");
                color = ler.next();

                Circulo circulo = new Circulo(color, raioC);
                System.out.println(circulo);

            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção invalida!");

            }
        }
    }
}