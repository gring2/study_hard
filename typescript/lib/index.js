"use strict";
function strEnum(o) {
    return o.reduce(function (res, key) {
        res[key] = key;
        return res;
    }, Object.create(null));
}
var Direction = strEnum([
    'North',
    'South',
    'East',
    'West'
]);
console.dir(Direction);
//# sourceMappingURL=index.js.map