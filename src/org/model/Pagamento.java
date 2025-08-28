package org.model;

import java.math.BigDecimal;

public class Pagamento {

    private long id;
    private enum tipopagamento{
        PIX,
        CARTAO_CREDITO,
        BOLETO,
        DINHEIRO,
        DEBITO
    }
    private BigDecimal valortotal;

    public Pagamento() {
        this.id = 0;
        this.valortotal = BigDecimal.ZERO;
    }

    public Pagamento(long id, BigDecimal valortotal) {
        this.id = id;
        this.valortotal = valortotal;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getValortotal() {
        return valortotal;
    }

    public void setValortotal(BigDecimal valortotal) {
        this.valortotal = valortotal;
    }
}
