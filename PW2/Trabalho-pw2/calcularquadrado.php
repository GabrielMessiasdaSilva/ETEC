<html>
    <head>
        <title>Pagina calcularquadrado.php</title>
</head>
<body>
    <br>
    <?php
    $A=$_POST['txtta'];
    $B=$_POST['txttb'];
    $soma=$A+$B;
    $quadr=pow($soma,2);
    echo"A soma dos valores é igual".$soma.'<br>';
    echo"O quadrado da soma é ".$quadr;
    ?>
    </body>
    </html>