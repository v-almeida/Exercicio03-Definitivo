package br.edu.up.modelos;

public class Curso24 {
    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;

    public Curso24(double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        return (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
    }

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public void setNotaLaboratorio(double notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }

    public double getNotaAvaliacaoSemestral() {
        return notaAvaliacaoSemestral;
    }

    public void setNotaAvaliacaoSemestral(double notaAvaliacaoSemestral) {
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
    }

    public double getNotaExameFinal() {
        return notaExameFinal;
    }

    public void setNotaExameFinal(double notaExameFinal) {
        this.notaExameFinal = notaExameFinal;
    }
}
