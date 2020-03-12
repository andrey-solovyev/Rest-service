<!DOCTYPE html>
<html xmlns:th="http://thymeleaf.org" lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new order</title>
    <script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
    <link href="style/style.css" rel="stylesheet">
    <style>
        body {
            background-image: url(static/image/backgroundAdd.jpg); /* Путь к фоновому изображению */

        }
    </style>
</head>
<body>
<div>
    <form method="post" action="add">
        <h2>Добавление заказа</h2>
        <p><label >Имя</label>
            <input  type="text" name="user_name" ><span></span></p>

        <p><label >Фамилия</label>
            <input type="text" name="user_surname" ><span></span></p>

        <p><label >Эл. почта</label>
            <input type="email" name="email"><span></span></p>

        <p><label >Телефон</label>
            <input type="number" min="1000000" name="phone" ><span></span></p>

        <p><label >Категория</label>
            <input type="text" name="category" ><span></span></p>

        <p><label >Гарантия</label>
            <input type="checkbox" name="warranty"><span></span></p>

        <p><label >Фирма</label>
            <input type="text" name="firm" ><span></span></p>

        <p><label >Дата</label>
            <input type="date" min="01.01.2019" value="13.07.2019" name="data"><span></span></p>
        <p><label >Состояние</label>
            <select size="0" name="state">
                <option disabled>Текущее состояние</option>
                <option value="Новая">Новая</option>
                <option value="В процессе">В процессе</option>
                <option value="Исправлена">Исправлена</option>
                <option value="Не подлжеит исправлению">Не подлежит исправлению</option>
            </select><span></span></p>

        <p><label >Проблема</label>
            <input type="text" name="problem" ><span></span></p>
        <p><label >Описание проблемы</label>
            <textarea type="text" name="fullproblem" ></textarea><span></span></p>
        <p><label >Мастер</label>
            <input type="text" name="master"><span></span></p>
        <button type="submit">Оставить заявку</button>
    </form>
</div>
<script src="js/main.js"></script>
</body>


</html>