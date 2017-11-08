'use strict';

const Immutable = require('immutable');

const set1 = Immutable.List(['punainen', 'vihreä', 'keltainen']);
const set2 = set1.set(3, 'ruskea');
console.log(set2);
console.log(set1.equals(set2));
const set3 = set2.set(4, 'ruskea');
console.log(set3);
console.log(set2.equals(set3));