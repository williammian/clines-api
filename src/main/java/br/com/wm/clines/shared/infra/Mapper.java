package br.com.wm.clines.shared.infra;

public interface Mapper<S, T> {
    T map(S source);
}
