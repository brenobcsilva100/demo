use escola

create table professor(
id int primary key auto_increment,
first_name varchar(50),
last_name varchar(50),
senha varchar(50),
datahora timestamp default current_timestamp);


       Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        professor.setDatahora(formatador.format(data.toString()));


        {
    "first_name":"dddd",
    "last_name":"dddd",
    "senha":"dddd",
    "datahora":"2014-12-03 12:24:54"
}