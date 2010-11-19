function searchFocus(e) {
    if (e.value == "Site Search") {
        e.value = "";
    }
}

function searchBlur(e) {
	if (e.value === "") {
		e.value = "Site Search";
	}
}
