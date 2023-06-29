//CREATE AND UPDATE
$(document).on("click", ".open-modal", function () {
    const currentPruebaId = Number($(this).attr('idprueba'));

    if (currentPruebaId) {
        const currentProduct = pruebas.find(x => x.id === currentPruebaId);
        $("#id").val(currentProduct.id);
        $("#nombre").val(currentProduct.nombre);
        $("#identificacion").val(currentProduct.identificacion);
        $("#nivel_cursando").val(currentProduct.nivel_cursando);
        $("#edad").val(currentProduct.edad);
        $("#altura").val(currentProduct.altura);
        $("#peso").val(currentProduct.peso);
        $("#genero").val(currentProduct.genero);
        
    }
});

$(document).on("click", "#savePrueba", function () {
    $("#formPruebat").submit();
})

//Delete
$(document).on("click", ".btnDeletePrueba", function () {
    const currentPruebaId = Number($(this).attr('idprueba'));
    const currentPrueba = products.find(x => x.id === currentPruebaId);
    $.ajax({
        url: 'prueba/delete',
        contentType: "application/json",
        dataType: 'json',
        type: 'POST',
        success: function (result) {
            location.reload();
        },
        //here we are serialization the object
        data: JSON.stringify(currentPrueba)
    });
})