//JavaScript überprüft nicht, welchen Datentyp eine Variable hat. Das kann zu Fehlern führen.

function add(a, b) {
    return a + b; 
}

console.log(add(5, 10));  // 15 (korrekt)
console.log(add(5, "10")); // "510" (unerwartet, weil 10 als Text behandelt wird)