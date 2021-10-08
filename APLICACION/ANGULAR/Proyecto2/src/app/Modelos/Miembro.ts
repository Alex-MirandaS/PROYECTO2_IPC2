export class Miembro {
    _usuario: String;
    _contraseña: String;
    _tipo: String;
    _capital: String;

    constructor(usuario: String, contraseña: String, tipo: String, capital:String) {
        this._usuario = usuario;
        this._contraseña = contraseña;
        this._tipo = tipo;
        this._capital = capital;
    }


}