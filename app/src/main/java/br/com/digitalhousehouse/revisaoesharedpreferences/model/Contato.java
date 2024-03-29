package br.com.digitalhousehouse.revisaoesharedpreferences.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Contato implements Parcelable {

    private String nome;
    private String telefone;
    private int imagem;

    public Contato() {
    }

    public Contato(String nome, String telefone, int imagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
    }


    protected Contato(Parcel in) {
        nome = in.readString();
        telefone = in.readString();
        imagem = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(telefone);
        dest.writeInt(imagem);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Contato> CREATOR = new Creator<Contato>() {
        @Override
        public Contato createFromParcel(Parcel in) {
            return new Contato(in);
        }

        @Override
        public Contato[] newArray(int size) {
            return new Contato[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getImagem() {
        return imagem;
    }

    public String setNome() {
        return nome;
    }

    public String setTelefone() {
        return telefone;
    }

    public int setImagem() {
        return imagem;
    }
}
