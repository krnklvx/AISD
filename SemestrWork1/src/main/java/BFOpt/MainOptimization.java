package BFOpt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MainOptimization {
    public static void main(String[] args) {
        // Создаем директорию если нужно
        if (!new File("results").exists()) {
            new File("results").mkdir();
        }

        try (FileWriter out = new FileWriter("results/benchmark.csv")) {
            out.write("v,e,time,iter\n");  // Упрощенные заголовки

            // Генерация графов от 100 до 10000 с шагом 200
            for (int v = 100; v <= 10000; v += 200) {
                Graph g = buildGraph(v);

                long t0 = System.nanoTime();
                g.bellmanFord(0);  // Запуск алгоритма
                long time = System.nanoTime() - t0;

                // Компактная запись результатов
                out.write(v + "," + g.getEdges() + "," + time + "," + g.getIterations() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Graph buildGraph(int v) {
        Graph g = new Graph(v);
        Random rand = new Random();

        // Ровно 2 ребра на вершину
        for (int i = 0; i < v * 2; i++) {
            int src = rand.nextInt(v);
            int dst;
            do {
                dst = rand.nextInt(v);
            } while (src == dst);

            // Четные - положительные, нечетные - отрицательные
            int w = (i % 2 == 0) ? rand.nextInt(100)+1 : -rand.nextInt(100)-1;
            g.addEdge(src, dst, w);
        }
        return g;
    }
}